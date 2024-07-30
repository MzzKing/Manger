$('.loginOut').click(function () {
    // 清除 localstorage 中的 user 信息
    localStorage.removeItem('User');
    // 跳转到登录页面
    window.location.href = './login.html';
});