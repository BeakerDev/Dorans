package gg.buff.dorans.query;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import gg.buff.dorans.exceptions.BadRequestException;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.exceptions.InternalServerErrorException;
import gg.buff.dorans.exceptions.NoResultException;
import gg.buff.dorans.exceptions.RateLimitExceededException;
import gg.buff.dorans.exceptions.ServiceUnavailableException;
import gg.buff.dorans.exceptions.UnauthorizedException;
import gg.buff.dorans.exceptions.UnknownException;
import gg.buff.dorans.objects.Region;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Map;

import static gg.buff.dorans.query.QueryConstants.APIKEY;
import static gg.buff.dorans.query.QueryConstants.SEPARATOR;

public class QueryManager {
	private final OkHttpClient client;
	private final String apiKey;
	private Region region = Region.NA;

	public QueryManager() {
		this(System.getProperty("dorans.apikey"));
	}

	public QueryManager(String apiKey) {
		this.apiKey = apiKey;
		this.client = new OkHttpClient();

		if (StringUtils.isEmpty(apiKey) || StringUtils.isBlank(apiKey)) {
			throw new IllegalArgumentException("The API Key cannot be null or empty");
		}
	}

	public String query(String path) throws DoransException {
		return query(path, null);
	}

	public String query(String path, Map<String, String> parameters) throws DoransException {
		Request request = new Request.Builder().url(new StringBuilder().append(region.getResourceUrl()).append(region.name().toLowerCase()).append(SEPARATOR).append(path).append(APIKEY).append(apiKey).append(buildParameters(parameters)).toString()).build();

		return execute(request);
	}

	public String observerQuery(String path) throws DoransException {
		Request request = new Request.Builder().url(new StringBuilder().append(region.getObserverUrl()).append(path).append(APIKEY).append(apiKey).toString()).build();

		return execute(request);
	}

	private String execute(Request request) throws DoransException {
		Response response;
		try {
			response = client.newCall(request).execute();
		} catch (IOException ex) {
			throw new UnknownException(ex);
		}

		if (!response.isSuccessful()) {
			switch (response.code()) {
				case 400:
					throw new BadRequestException();
				case 401:
					throw new UnauthorizedException();
				case 404:
					throw new NoResultException();
				case 429:
					throw new RateLimitExceededException();
				case 500:
					throw new InternalServerErrorException();
				case 503:
					throw new ServiceUnavailableException();
				default:
					throw new UnknownException();
			}
		}

		try {
			return response.body().string();
		} catch (IOException e) {
			throw new UnknownException(e);
		}
	}

	private String buildParameters(Map<String, String> parameters) {
		if (parameters == null || parameters.isEmpty()) {
			return StringUtils.EMPTY;
		}
		StringBuilder builder = new StringBuilder();
		for (Map.Entry<String, String> pair : parameters.entrySet()) {
			builder.append("&").append(pair.getKey()).append("=").append(pair.getValue());
		}

		return builder.toString();
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
}
