Dorans
------

Dorans is a Java implementation for the [Riot Games API][riot-games-api]. The goal of Dorans is to seperate the API calls to the Riot API from the generation of Java objects from the JSON allowing you to store the raw JSON. 

Dorans is still in active development and is not currently stable.


##Using
Once a initial version is released we will work to get it added to the Maven Central repository.

Snapshot Repository:

```xml
<repositories>
    <repository>
        <id>alta-nexus</id>
        <name>Alta Nexus Releases</name>
        <url>http://nexus.alta189.com/content/repositories/releases/</url>
    </repository>
</repositories>
```

Snapshot Dependency:

```xml
<dependencies>
	<dependency>
		<groupId>gg.buff</groupId>
		<artifactId>dorans</artifactId>
		<version>1.0.0-SNAPSHOT</version>
	</dependency>
</dependencies>
```

##Licensing

Dorans is licensed under the [New BSD Lincense][license].

Dorans isn't endorsed by Riot Games and doesn't reflect the views or opinions of Riot Games or anyone officially involved in producing or managing League of Legends. League of Legends and Riot Games are trademarks or registered trademarks of Riot Games, Inc. League of Legends © Riot Games, Inc.

[riot-games-api]: https://developer.riotgames.com/
[license]: LICENSE.txt
