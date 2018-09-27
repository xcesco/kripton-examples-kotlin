# kripton-examples-kotlin
This repository is created to host Kripton examples written in Kotlin language.

## Rss Reader (Kotlin version)
This example get an BBC's RSS feed channel (XML) from a REST service, store feeds in a SQLite database and show it. Data management is done using ViewModel, LiveData and Kripton Persistence Library.

<img width="300px" src="https://github.com/xcesco/wikis/blob/master/kripton/rss-reader.gif"/>

Code is available <a href="https://github.com/xcesco/kripton-examples/tree/master/kotlin-rss-reader">here</a>.

The RSS Feed is here:
```
http://feeds.bbci.co.uk/news/rss.xml?edition=int
```

This simple app was built as showroom for some features of Kripton:
- Integration with Retrofit to consume REST service
- Convert XML into Java beans
- Persist data on SQLite database
- How to embed an entity in a field and how to use it as sqlite table
- How to use a unique model rapresentations for REST services and SQLite persistence
- SQLite type adapter usage
- SQLite relationship definition
- How generate Live Data from DAO queries
- How to use Kripton in a ViewModel 
- How to write queries in compact mode
- How to use dynamic where conditions in SQL queries

You can also read [Kripton Live Data — First contact](https://medium.com/@xcesco/kripton-live-data-first-contact-579db390cc7d).
