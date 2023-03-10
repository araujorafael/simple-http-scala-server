# Simple server 

This project is just a simple server written in scala using [Zio Framework](https://zio.dev/)

### Road Map

#### Project Structure 
- [X] Base sbt deps file.
- [X] Have a working docker image.
- [X] Implement default server with example app/controller/router.
- [X] Implement a configurable server layer/object _(Could be something like `HttpServerConfig` object)_.
- [x] Configuration also could be changed setting ENV vars

#### Apps
- [ ] An app that receives data from `GET` and `POST` methods and process that in some sort without any persistence.
- [ ] An app that receives and process data from `POST` method and has some sort of persistence layer (DB or in memory)
- [ ] An app that receives data from kafka topic and re-publish the processed data


### Env vars

 - *PORT*: Defines the port where the _http_ requests will be listened _(default: 8080)_
 - *HOST*: Defines the hostname _(default: localhost)_

### How to run

``` shell
$ sbt run
```
