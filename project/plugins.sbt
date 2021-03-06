addSbtPlugin("me.lessis"           % "bintray-sbt"           % "0.3.0")
addSbtPlugin("com.github.gseitz"   % "sbt-release"           % "1.0.3")
addSbtPlugin("com.jsuereth"        % "sbt-pgp"               % "1.0.0")
addSbtPlugin("org.scoverage"       % "sbt-scoverage"         % "1.5.0")
addSbtPlugin("com.typesafe.sbt"    % "sbt-git"               % "0.8.5")
addSbtPlugin("org.scala-js"        % "sbt-scalajs"           % "0.6.14")
addSbtPlugin("org.xerial.sbt"      % "sbt-sonatype"          % "1.1")

resolvers += Resolver.sonatypeRepo("snapshots")
addSbtPlugin("org.scala-native" % "sbt-cross"         % "0.1.0-SNAPSHOT")
addSbtPlugin("org.scala-native" % "sbt-scalajs-cross" % "0.1.0-SNAPSHOT")
addSbtPlugin("org.scala-native" % "sbt-scala-native"  % "0.1.0-SNAPSHOT")
