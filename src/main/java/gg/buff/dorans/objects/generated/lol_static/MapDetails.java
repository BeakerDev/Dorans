package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MapDetails
 * <p>
 * This object contains map details data
 */
@Generated("org.jsonschema2pojo")
public class MapDetails {

	/**
	 * Image
	 * <p>
	 * This object contains spell vars data
	 */
	@Expose
	private Image image;
	@Expose
	private long mapId;
	@Expose
	private String mapName;
	@Expose
	private List<Long> unpurchasableItemList = new ArrayList<Long>();

	/**
	 * Image
	 * <p>
	 * This object contains spell vars data
	 * 
	 * @return The image
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * Image
	 * <p>
	 * This object contains spell vars data
	 * 
	 * @param image
	 *            The image
	 */
	public void setImage(Image image) {
		this.image = image;
	}

	/**
	 * @return The mapId
	 */
	public long getMapId() {
		return mapId;
	}

	/**
	 * @param mapId
	 *            The mapId
	 */
	public void setMapId(long mapId) {
		this.mapId = mapId;
	}

	/**
	 * @return The mapName
	 */
	public String getMapName() {
		return mapName;
	}

	/**
	 * @param mapName
	 *            The mapName
	 */
	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	/**
	 * @return The unpurchasableItemList
	 */
	public List<Long> getUnpurchasableItemList() {
		return unpurchasableItemList;
	}

	/**
	 * @param unpurchasableItemList
	 *            The unpurchasableItemList
	 */
	public void setUnpurchasableItemList(List<Long> unpurchasableItemList) {
		this.unpurchasableItemList = unpurchasableItemList;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(image).append(mapId).append(mapName).append(unpurchasableItemList).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MapDetails) == false) {
			return false;
		}
		MapDetails rhs = ((MapDetails) other);
		return new EqualsBuilder().append(image, rhs.image).append(mapId, rhs.mapId).append(mapName, rhs.mapName).append(unpurchasableItemList, rhs.unpurchasableItemList).isEquals();
	}

}
