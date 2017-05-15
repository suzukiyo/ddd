import React from 'react';
import ReactDom from 'react-dom';

import Introduction from 'view/Introduction';
import IntroductionAction from 'action/IntroductionAction';

export default class Introduction {

    render() {
        ReactDom.render(
            <Introduction Action={IntroductionAction} />,
            document.getElementById('limited-profile')
        );
    }

}