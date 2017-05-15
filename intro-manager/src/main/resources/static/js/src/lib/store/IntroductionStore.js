import dispatcher from 'dispatcher/Dispatcher'
import {EventEmitter} from "events";
import * as actionTypes from 'constant/IntroductionActionTypes';

const store = {
}

class Store extends EventEmitter {
    constructor() {
        super();
        this.setMaxListeners(20);
        dispatcher.register(payload => {
            switch (payload.actionType) {
                case actionTypes.SHOW:
                    this.show(payload.value);
                    break;
                case actionTypes.REGISTER:
                    this.show(payload.value);
                    break;
            }
        });
    }

    show() {
        // ajax
        this.emit('change');
    }

    register() {
        // ajax
    }
}

const store = new Store();
export default store;