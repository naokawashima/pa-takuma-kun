package jp.co.futurenavigator.ptk.ap.api.logic.impl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.futurenavigator.ptk.ap.api.back.bridge.dto.BridgeInDto;
import jp.co.futurenavigator.ptk.ap.api.back.bridge.dto.BridgeOutDto;
import jp.co.futurenavigator.ptk.ap.api.logic.impl.service.SimpleReplyLogicImplService;

@RequestMapping("/simpleReplyLogicImpl")
@RestController
public class SimpleReplyLogicController {

	/** REST通信呼び出し用Bean設定 */
	@Autowired
	private SimpleReplyLogicImplService service;

	/**
	 * 登録
	 * @param inDto 要求DTO
	 * @return 応答DTO
	 */
	@RequestMapping(method = RequestMethod.POST)
	public BridgeOutDto post(@Validated @RequestBody BridgeInDto inDto) {
		return service.saveChat(inDto);
	}

	/**
	 * 更新
	 * @param inDto 要求DTO
	 * @return 応答DTO
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "{id}")
	public BridgeOutDto put(@RequestBody BridgeInDto inDto) {
		return service.saveChat(inDto);
	}

}