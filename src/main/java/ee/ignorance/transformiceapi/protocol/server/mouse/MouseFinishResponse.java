package ee.ignorance.transformiceapi.protocol.server.mouse;

import java.util.List;

import ee.ignorance.transformiceapi.processors.AbstractProcessor;
import ee.ignorance.transformiceapi.processors.mouse.MouseFinishProcessor;
import ee.ignorance.transformiceapi.protocol.server.Processable;

public final class MouseFinishResponse implements Processable {

        private int mouseID;
        private int standing;
        private double finishTime;

        public MouseFinishResponse(List<String> rawMessage) {
	            mouseID = Integer.valueOf(rawMessage.get(1));
	            standing = Integer.valueOf(rawMessage.get(4));
	            finishTime = Integer.valueOf(rawMessage.get(5)) / 10.0;
        }

        public int getMouseID() {
                return mouseID;
        }

        public double getFinishTime() {
                return finishTime;
        }

        public int getStanding() {
                return standing;
        }

        @Override
        public AbstractProcessor getProcessor() {
                return new MouseFinishProcessor();
        }
}
