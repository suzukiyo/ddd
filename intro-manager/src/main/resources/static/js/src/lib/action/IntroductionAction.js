import dispatcher from 'dispatcher/Dispatcher'
import * as actionTypes from 'constant/IntroductionActionTypes'

export default class IntroductionAction {

    register() {
        dispatcher.dispatch({
            actionType: actionTypes.REGISTER
        });
    }

}