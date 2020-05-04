package com.don.tcloudcg.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigClientController {
    @Value("${tcloudcg.minfo}")
    private String minfo;
    @Value("${tcloudcg.mname}")
    private String mname;

    @GetMapping("/minfo")
    public String getMinfo()
    {
        System.out.println(minfo.chars());
        return minfo;
    }

    @GetMapping("/mname")
    public String getMname()
    {
        return mname;
    }

}
