import dispatcher from 'dispatcher/Dispatcher'
import * as introductionActionTypes from 'constant/IntroductionActionTypes'
import * as workActionTypes from 'constant/WorkActionTypes'

export default class MenuAction {
    initialize() {
        showIntroduction()
    }

    showIntroduction() {
        dispatcher.dispatch({
            actionType: introductionActionTypes.SHOW
        });
    }

    showWork() {
        dispatcher.dispatch({
            actionType: workActionTypes.SHOW
        });
    }

}