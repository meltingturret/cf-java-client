package io.meltingturret.cf.client.model.routes;

import lombok.Data;

import java.util.Map;

/**
 * Routes query model.
 */
@Data
public class Query {
    /**
     * A relationship to the space containing the route; routes can only be mapped to destinations in that space.
     */
    private String space;
    /**
     * A relationship to the domain of the route
     */
    private String domain;
    /**
     * The host component for the route; not compatible with routes specifying the tcp protocol.
     */
    private String host;
    /**
     * The path component for the route; should begin with a / and not compatible with routes specifying the tcp protocol.
     */
    private String path;
    /**
     * The port the route will listen on; only compatible with routes leveraging a domain that supports the tcp protocol.
     * <p>
     * For tcp domains, a port will be randomly assigned if not specified.
     */
    private Integer port;
    /**
     * Labels applied to the route.
     */
    private Map<String, String> labels;
}
