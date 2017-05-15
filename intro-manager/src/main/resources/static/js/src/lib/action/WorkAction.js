import dispatcher from 'dispatcher/Dispatcher'
import * as actionTypes from 'constant/WorkActionTypes'

export default class WorkAction {

    register() {
        dispatcher.dispatch({
            actionType: actionTypes.REGISTER
        });
    }

}