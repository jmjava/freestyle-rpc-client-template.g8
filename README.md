## Note: this is based on https://github.com/frees-io/freestyle-template.g8
This is a Giter8 template for Freestyle RPC Server projects.

## Creating New Freestyle RPC Server Project

1. Create a new project from Freestyle g8 template:

```scala
sbt new jmjava/freestyle-rpc-server-template.g8
```

## Debugging this template

In the case you need to change this plugin, the easiest way to test it locally is:

```
sbt new file:///the/path/to/freestyle-rpc-client-template.g8
```


##### For example from the checkout directory - use the template to generate a new project

```
/git/freestyle-rpc-client-template.g8$ sbt new file://`pwd`﻿

--follow prompts

```

##### Now compile and package the project

```
/git/freestyle-rpc-client-template.g8/freestyle/ sbt compile

```

###NOTE : this project depends on other projects in my repo to be published locally


Template license
----------------
Written in 2018 by John Menke

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.