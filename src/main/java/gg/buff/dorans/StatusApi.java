package gg.buff.dorans;

import com.google.gson.reflect.TypeToken;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.objects.Region;
import gg.buff.dorans.objects.generated.status.Shard;

import java.lang.reflect.Type;
import java.util.List;

public class StatusApi extends CommonApi {
	private final Type typeListShard = new TypeToken<List<Shard>>() {
	}.getType();

	protected StatusApi(Dorans parent) {
		super(parent, "v1.0");
	}

	/**
	 * Method to get all Shards
	 *
	 * @return raw json list of shards
	 * @throws DoransException
	 */
	public String getShardsRaw() throws DoransException {
		return getParent().getQuery().staticQuery("/shards");
	}

	/**
	 * Method to get all Shards
	 *
	 * @return list of shards as {@link List} of {@link Shard}
	 * @throws DoransException
	 */
	public List<Shard> getShards() throws DoransException {
		return getParent().getGson().fromJson(getShardsRaw(), typeListShard);
	}

	/**
	 * Method to get a region's shard
	 *
	 * @param region region to get the shard for
	 * @return raw json shard object
	 * @throws DoransException
	 */
	public String getShardRaw(Region region) throws DoransException {
		return getParent().getQuery().statusQuery(new StringBuilder("/shards/").append(region.name().toLowerCase()).toString());
	}

	/**
	 * Method to get a region's shard
	 *
	 * @param region region to get the shard for
	 * @return shard object as a {@link Shard}
	 * @throws DoransException
	 */
	public Shard getShard(Region region) throws DoransException {
		return getParent().getGson().fromJson(getShardRaw(region), Shard.class);
	}
}
