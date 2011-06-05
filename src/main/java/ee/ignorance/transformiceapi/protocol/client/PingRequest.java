package ee.ignorance.transformiceapi.protocol.client;

import ee.ignorance.transformiceapi.protocol.ByteBuffer;

public final class PingRequest implements StringMessageRequest {

	private long lastPingTime;
	
	public PingRequest(long lastPingTime) {
		this.lastPingTime = lastPingTime;
	}
	
	@Override
	public byte[] getBytes() {
		ByteBuffer bf = new ByteBuffer();
		bf.write(0x1a);
		bf.write(0x02);
		bf.write(0x01);
		bf.print("" + (System.currentTimeMillis() - lastPingTime));
		return bf.getBytes();
	}

}
