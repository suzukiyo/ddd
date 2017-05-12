import React from 'react';
import ReactDom from 'react-dom';

import Introduction from 'view/Introduction';
import IntroductionAction from 'action/IntroductionAction';

window.onload = () => {

    ReactDom.render(
        <Introduction Action={IntroductionAction} />,
        document.getElementById('limited-profile')
    );

}

