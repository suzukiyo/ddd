import dispatcher from 'dispatcher/Dispatcher'
import {EventEmitter} from "events";
import * as actionTypes from 'constant/WorkActionTypes'

const store = {
}

class Store extends EventEmitter {
    constructor() {
        super();
        this.setMaxListeners(20);
        dispatcher.register(payload => {
            switch (payload.actionType) {
                case actionTypes.SHOW:
                    this.showIntroduction(payload.value);
                    break;
                case actionTypes.REGISTER:
                    this.showWork(payload.value);
                    break;
            }
        });
    }

    show() {
        // ajaxでロード
        this.emit('change');
    }

    register() {
        // ajaxでロード
    }
}

const store = new Store();
export default store;