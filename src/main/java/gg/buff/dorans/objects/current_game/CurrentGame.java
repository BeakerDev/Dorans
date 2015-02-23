
package gg.buff.dorans.objects.current_game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Current Game Info
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class CurrentGame {

    /**
     * Banned champion information
     * <p>
     * 
     * 
     */
    @Expose
    private List<BannedChampion> bannedChampions = new ArrayList<BannedChampion>();
    /**
     * The ID of the game
     * <p>
     * 
     * 
     */
    @Expose
    private long gameId;
    /**
     * The amount of time in seconds that has passed since the game started
     * <p>
     * 
     * 
     */
    @Expose
    private long gameLength;
    /**
     * The game mode
     * <p>
     * 
     * 
     */
    @Expose
    private CurrentGame.GameMode gameMode;
    /**
     * The queue type (queue types are documented on the Game Constants page)
     * <p>
     * 
     * 
     */
    @Expose
    private long gameQueueConfigId;
    /**
     * The game start time represented in epoch milliseconds
     * <p>
     * 
     * 
     */
    @Expose
    private long gameStartTime;
    /**
     * The game type
     * <p>
     * 
     * 
     */
    @Expose
    private CurrentGame.GameType gameType;
    /**
     * The Id of the map
     * <p>
     * 
     * 
     */
    @Expose
    private long mapId;
    /**
     * The observer information
     * <p>
     * 
     * 
     */
    @Expose
    private List<Observer> observers = new ArrayList<Observer>();
    /**
     * The participant information
     * <p>
     * 
     * 
     */
    @Expose
    private List<Participant> participants = new ArrayList<Participant>();
    /**
     * The ID of the platform on which the game is being played
     * <p>
     * 
     * 
     */
    @Expose
    private String platformId;

    /**
     * Banned champion information
     * <p>
     * 
     * 
     * @return
     *     The bannedChampions
     */
    public List<BannedChampion> getBannedChampions() {
        return bannedChampions;
    }

    /**
     * Banned champion information
     * <p>
     * 
     * 
     * @param bannedChampions
     *     The bannedChampions
     */
    public void setBannedChampions(List<BannedChampion> bannedChampions) {
        this.bannedChampions = bannedChampions;
    }

    /**
     * The ID of the game
     * <p>
     * 
     * 
     * @return
     *     The gameId
     */
    public long getGameId() {
        return gameId;
    }

    /**
     * The ID of the game
     * <p>
     * 
     * 
     * @param gameId
     *     The gameId
     */
    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    /**
     * The amount of time in seconds that has passed since the game started
     * <p>
     * 
     * 
     * @return
     *     The gameLength
     */
    public long getGameLength() {
        return gameLength;
    }

    /**
     * The amount of time in seconds that has passed since the game started
     * <p>
     * 
     * 
     * @param gameLength
     *     The gameLength
     */
    public void setGameLength(long gameLength) {
        this.gameLength = gameLength;
    }

    /**
     * The game mode
     * <p>
     * 
     * 
     * @return
     *     The gameMode
     */
    public CurrentGame.GameMode getGameMode() {
        return gameMode;
    }

    /**
     * The game mode
     * <p>
     * 
     * 
     * @param gameMode
     *     The gameMode
     */
    public void setGameMode(CurrentGame.GameMode gameMode) {
        this.gameMode = gameMode;
    }

    /**
     * The queue type (queue types are documented on the Game Constants page)
     * <p>
     * 
     * 
     * @return
     *     The gameQueueConfigId
     */
    public long getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    /**
     * The queue type (queue types are documented on the Game Constants page)
     * <p>
     * 
     * 
     * @param gameQueueConfigId
     *     The gameQueueConfigId
     */
    public void setGameQueueConfigId(long gameQueueConfigId) {
        this.gameQueueConfigId = gameQueueConfigId;
    }

    /**
     * The game start time represented in epoch milliseconds
     * <p>
     * 
     * 
     * @return
     *     The gameStartTime
     */
    public long getGameStartTime() {
        return gameStartTime;
    }

    /**
     * The game start time represented in epoch milliseconds
     * <p>
     * 
     * 
     * @param gameStartTime
     *     The gameStartTime
     */
    public void setGameStartTime(long gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    /**
     * The game type
     * <p>
     * 
     * 
     * @return
     *     The gameType
     */
    public CurrentGame.GameType getGameType() {
        return gameType;
    }

    /**
     * The game type
     * <p>
     * 
     * 
     * @param gameType
     *     The gameType
     */
    public void setGameType(CurrentGame.GameType gameType) {
        this.gameType = gameType;
    }

    /**
     * The Id of the map
     * <p>
     * 
     * 
     * @return
     *     The mapId
     */
    public long getMapId() {
        return mapId;
    }

    /**
     * The Id of the map
     * <p>
     * 
     * 
     * @param mapId
     *     The mapId
     */
    public void setMapId(long mapId) {
        this.mapId = mapId;
    }

    /**
     * The observer information
     * <p>
     * 
     * 
     * @return
     *     The observers
     */
    public List<Observer> getObservers() {
        return observers;
    }

    /**
     * The observer information
     * <p>
     * 
     * 
     * @param observers
     *     The observers
     */
    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    /**
     * The participant information
     * <p>
     * 
     * 
     * @return
     *     The participants
     */
    public List<Participant> getParticipants() {
        return participants;
    }

    /**
     * The participant information
     * <p>
     * 
     * 
     * @param participants
     *     The participants
     */
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    /**
     * The ID of the platform on which the game is being played
     * <p>
     * 
     * 
     * @return
     *     The platformId
     */
    public String getPlatformId() {
        return platformId;
    }

    /**
     * The ID of the platform on which the game is being played
     * <p>
     * 
     * 
     * @param platformId
     *     The platformId
     */
    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bannedChampions).append(gameId).append(gameLength).append(gameMode).append(gameQueueConfigId).append(gameStartTime).append(gameType).append(mapId).append(observers).append(participants).append(platformId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurrentGame) == false) {
            return false;
        }
        CurrentGame rhs = ((CurrentGame) other);
        return new EqualsBuilder().append(bannedChampions, rhs.bannedChampions).append(gameId, rhs.gameId).append(gameLength, rhs.gameLength).append(gameMode, rhs.gameMode).append(gameQueueConfigId, rhs.gameQueueConfigId).append(gameStartTime, rhs.gameStartTime).append(gameType, rhs.gameType).append(mapId, rhs.mapId).append(observers, rhs.observers).append(participants, rhs.participants).append(platformId, rhs.platformId).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum GameMode {

        @SerializedName("CLASSIC")
        CLASSIC("CLASSIC"),
        @SerializedName("ODIN")
        ODIN("ODIN"),
        @SerializedName("ARAM")
        ARAM("ARAM"),
        @SerializedName("TUTORIAL")
        TUTORIAL("TUTORIAL"),
        @SerializedName("ONEFORALL")
        ONEFORALL("ONEFORALL"),
        @SerializedName("ASCENSION")
        ASCENSION("ASCENSION"),
        @SerializedName("FIRSTBLOOD")
        FIRSTBLOOD("FIRSTBLOOD"),
        @SerializedName("KINGPORO")
        KINGPORO("KINGPORO");
        private final String value;
        private static Map<String, CurrentGame.GameMode> constants = new HashMap<String, CurrentGame.GameMode>();

        static {
            for (CurrentGame.GameMode c: values()) {
                constants.put(c.value, c);
            }
        }

        private GameMode(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static CurrentGame.GameMode fromValue(String value) {
            CurrentGame.GameMode constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum GameType {

        @SerializedName("CUSTOM_GAME")
        CUSTOM_GAME("CUSTOM_GAME"),
        @SerializedName("MATCHED_GAME")
        MATCHED_GAME("MATCHED_GAME"),
        @SerializedName("TUTORIAL_GAME")
        TUTORIAL_GAME("TUTORIAL_GAME");
        private final String value;
        private static Map<String, CurrentGame.GameType> constants = new HashMap<String, CurrentGame.GameType>();

        static {
            for (CurrentGame.GameType c: values()) {
                constants.put(c.value, c);
            }
        }

        private GameType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static CurrentGame.GameType fromValue(String value) {
            CurrentGame.GameType constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
