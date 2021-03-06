/*
 * Copyright (c) 2016 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ch.vorburger.nulls.examples.hello;

import org.eclipse.jdt.annotation.Nullable;

public interface SomeInterface {

    void someMethodWithNullableArgument(@Nullable Object anObject);

}
