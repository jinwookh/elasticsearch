/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.core.indexlifecycle.action;

import org.elasticsearch.test.AbstractStreamableTestCase;
import org.elasticsearch.test.EqualsHashCodeTestUtils.MutateFunction;
import org.elasticsearch.xpack.core.indexlifecycle.action.PutLifecycleAction.Response;

public class PutLifecycleResponseTests extends AbstractStreamableTestCase<PutLifecycleAction.Response> {

    @Override
    protected Response createTestInstance() {
        return new Response(randomBoolean());
    }

    @Override
    protected Response createBlankInstance() {
        return new Response();
    }

    @Override
    protected Response mutateInstance(Response response) {
        return new Response(response.isAcknowledged() == false);
    }

}
