//============================================================================//
//                                                                            //
//                         Copyright © 2015 Sandpolis                         //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation.                                   //
//                                                                            //
//============================================================================//

plugins {
	id("java-library")
	id("com.sandpolis.build.module")
	id("com.sandpolis.build.protobuf")
	id("com.sandpolis.build.publish")
	id("com.sandpolis.build.plugin")
	id("com.sandpolis.build.codegen")
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.+")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.+")

	//implementation platform("ai.djl:bom:0.13.0")
	//implementation "ai.djl.mxnet:mxnet-engine"
	//runtimeOnly "ai.djl.mxnet:mxnet-native-auto"

	if (project.getParent() == null) {
		api("com.sandpolis:core.instance:+")
	} else {
		api(project(":module:com.sandpolis.core.instance"))
	}
}

sandpolis_plugin {
	id = project.name
	coordinate = "com.sandpolis:sandpolis-plugin-alert"
	name = "Alert Plugin"
	description = ""
}
