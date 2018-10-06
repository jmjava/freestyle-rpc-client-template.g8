addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M11" cross CrossVersion.full)


// required for a protocol definition:
libraryDependencies += "io.frees" %% "frees-rpc-client-core"       % "0.14.1"

// required for the use of the derived RPC Client/s, using either Netty or OkHttp as transport layer:
libraryDependencies += "io.frees" %% "frees-rpc-client-netty"      % "0.14.1"
// or:
//libraryDependencies += "io.frees" %% "frees-rpc-client-okhttp"     % "0.14.1"

// optional - for both server and client configuration.
libraryDependencies += "io.frees" %% "frees-rpc-config"            % "0.14.1"

// optional - for both server and client metrics reporting, using Prometheus.
//libraryDependencies += "io.frees" %% "frees-rpc-prometheus-server" % "0.14.1"
//ibraryDependencies += "io.frees" %% "frees-rpc-prometheus-client" % "0.14.1"

// optional - for both server and client metrics reporting, using Dropwizard.
//libraryDependencies += "io.frees" %% "frees-rpc-dropwizard-server" % "0.14.1"
//libraryDependencies += "io.frees" %% "frees-rpc-dropwizard-client" % "0.14.1"

// optional - for the communication between server and client by using SSL/TLS.
//libraryDependencies += "io.frees" %% "frees-rpc-netty-ssl" % "0.14.1"

// optional - for using the jodatime marshallers.
//libraryDependencies += "io.frees" %% "frees-rpc-marshallers-jodatime" % "0.14.1"






lazy val root = project
  .in(file("."))
  .settings(name := "freestyle-rpc-client")
  .settings(moduleName := "root")
  //.settings(noPublishSettings: _*)
  //.settings(scalaMetaSettings: _*)
  //.settings(libraryDependencies ++= commonDeps ++ freestyleCoreDeps())
  //.settings(libraryDependencies += "io.frees" %% "frees-core" % "0.8.1")
  //.settings(libraryDependencies += "io.frees" %% "frees-logging" % "0.8.1")
  // .settings(libraryDependencies += "io.frees" %% "frees-doobie" % "0.8.1")
  //.settings(libraryDependencies += "io.frees" %% "frees-effects" % "0.8.1")




  .settings(libraryDependencies += "io.frees" %% "core-freestyle-lib" % "0.1.2-SNAPSHOT")
  .settings(libraryDependencies += "io.frees" %% "freestyle-lib" % "0.1.2-SNAPSHOT")
  //.settings(libraryDependencies += "io.frees" %% "frees-todolist-lib" % "0.8.1")
  .settings(libraryDependencies += "io.frees" %% "freestyle-protocol" % "0.1.2-SNAPSHOT")
  .settings(libraryDependencies += "io.frees" %% "freestyle-runtime" % "0.1.2-SNAPSHOT")









