package org.gazzax.labs.solrdf.log;

/**
 * Message catalog.
 * An interface that (hopefully) enumerates all log messages.
 * 
 * @author Andrea Gazzarini
 * @since 1.0
 */
public interface MessageCatalog {
	String PREFIX = "<SOLRDF";
	
	String _00090_SWITCHING_2_HYB_MODE = PREFIX + "-00090> : Switching to Hybrid mode.";
	String _00091_NULL_QUERY_OR_EXECUTION = PREFIX + "-00091> : Query or QueryExecution cannot be null.";
	String _00092_NEGOTIATED_CONTENT_TYPE = PREFIX + "-00092> : Query type %s, incoming Accept header is %s, applied Content-type is %s";
	String _00093_GSP_REQUEST = PREFIX + "-00093> : Incoming GraphStoreProtocol %s request on %s Graph.";
	 
}