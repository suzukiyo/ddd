import React from 'react';
import ReactDom from 'react-dom';

import Menu from 'view/Menu';
import MenuAction from 'action/MenuAction';

export default class Menu {

    render() {
        ReactDom.render(
            <Menu Action={MenuAction} />,
            document.getElementById('menu')
        );
    }

}