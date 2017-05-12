import React from 'react';
import ReactDom from 'react-dom';

import Work from 'view/Work';
import WorkAction from 'action/WorkAction';

window.onload = () => {

    ReactDom.render(
        <Work Action={WorkAction} />,
        document.getElementById('work')
    );

}