import React from 'react';
import ReactDom from 'react-dom';

import Menu from 'view/Menu';
import MenuAction from 'action/MenuAction';

window.onload = () => {

    ReactDom.render(
        <Menu Action={MenuAction} />,
        document.getElementById('menu')
    );

}

