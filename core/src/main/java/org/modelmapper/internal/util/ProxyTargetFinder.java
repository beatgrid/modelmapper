package org.modelmapper.internal.util;

public interface ProxyTargetFinder {
    /**
     * Finds the leaf most target for a potential proxy or the object itself if it is not a proxy.
     *
     * @param source The source object
     * @return The target for the proxy
     */
    <T, S extends T> S findTarget(T source);
}
