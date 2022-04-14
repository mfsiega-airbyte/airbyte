/*
 * Copyright (c) 2021 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.metrics.reporter;

import io.micronaut.runtime.Micronaut;

public class Application {

  public static void main(final String[] args) {
    Micronaut.run(Application.class, args);
  }

}