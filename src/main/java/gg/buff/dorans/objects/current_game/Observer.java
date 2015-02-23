
package gg.buff.dorans.objects.current_game;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Observer
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class Observer {

    /**
     * Key used to decrypt the spectator grid game data for playback
     * <p>
     * 
     * 
     */
    @Expose
    private Object encryptionKey;

    /**
     * Key used to decrypt the spectator grid game data for playback
     * <p>
     * 
     * 
     * @return
     *     The encryptionKey
     */
    public Object getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Key used to decrypt the spectator grid game data for playback
     * <p>
     * 
     * 
     * @param encryptionKey
     *     The encryptionKey
     */
    public void setEncryptionKey(Object encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(encryptionKey).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Observer) == false) {
            return false;
        }
        Observer rhs = ((Observer) other);
        return new EqualsBuilder().append(encryptionKey, rhs.encryptionKey).isEquals();
    }

}
