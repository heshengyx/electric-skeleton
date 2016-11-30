package com.grgbanking.electric.service;

import java.util.List;

import com.grgbanking.electric.param.OrganizationQueryParam;
import com.grgbanking.electric.tree.Tree;

public interface ITreeService {

	List<Tree> tree(OrganizationQueryParam param);
}
