Communication between two mediums require client-server architecture where the one who receives becomes client and the one who sends becomes server.Now there are two main types of protocols for transporting data - TCP and UDP.Tcp is often chosen coz it is a connection-oriented protocol it guarantees the delivery of data packet transfer.Both HTTP and WebSocket are communication protocols used over TCP. 
HTTP is unidirectional the client sends the request and the server sends the response, after sending the response the connection gets closed. HTTP is a stateless protocol, which means that the connection between the browser and the server is lost once the transaction ends.
Whereas webSocket is bidirectional, a full-duplex protocol i.e data flows simultaneously in both directions. It is a stateful protocol, which means the connection between client and server will keep alive until it is terminated by either party (client or server).That is why websockets are used for real-time applications.

Tech stack used => Java, Spring Boot, Html, Bootstrap and Jquery.

It is a simple chat room made using the above technologies to grasp a fine understanding of how web sockets work - how connection is established, how messages can be sent or subscribed etc.
Got to know about a new protocol STOMP(Simple Text Oriented Messaging Protocol) - it provides higher semantics on top of the WebSockets protocol and defines a handful of frame types that are mapped onto WebSockets frames. Some of these types are: connect, subscribe, unsubscribe, send (messages sent to the server), message (for messages send from the server) BEGIN, COMMIT, ROLLBACK (transaction management).
