package ee.ignorance.transformiceapi.event.mouse;

import ee.ignorance.transformiceapi.Mouse;
import ee.ignorance.transformiceapi.event.Event;

public class MouseLeaveRoomEvent implements Event<MouseLeaveRoomListener> {

        private Mouse mouse;

        public MouseLeaveRoomEvent(Mouse mouse) {
                this.mouse = mouse;
        }

        public Mouse getMouse() {
                return mouse;
        }

        @Override
        public void notifyListener(MouseLeaveRoomListener listener) {
                listener.mouseLeftRoom(mouse);
        }
}
