/*     / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang.collection;

import java.util.ArrayList;
import java.util.stream.Collector;


public class HashMapTest extends AbstractMapTest {

    @Override
    protected <T> Map<Integer, T> emptyMap() {
        return HashMap.empty();
    }

    @Override
    protected <T> Collector<Map.Entry<Integer, T>, ArrayList<Map.Entry<Integer, T>>, ? extends Map<Integer, T>> mapCollector() {
        return HashMap.<Integer, T>collector();
    }
}
