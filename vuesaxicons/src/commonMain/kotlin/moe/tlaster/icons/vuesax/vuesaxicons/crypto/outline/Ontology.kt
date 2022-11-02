package moe.tlaster.icons.vuesax.vuesaxicons.crypto.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.OutlineGroup

public val OutlineGroup.Ontology: ImageVector
    get() {
        if (_ontology != null) {
            return _ontology!!
        }
        _ontology = Builder(name = "Ontology", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7005f, 22.7498f)
                curveTo(11.6005f, 22.7498f, 11.5105f, 22.7498f, 11.4105f, 22.7498f)
                curveTo(5.9305f, 22.5998f, 1.4805f, 17.8798f, 1.4805f, 12.2398f)
                verticalLineTo(5.2098f)
                curveTo(1.4805f, 4.6998f, 1.7805f, 4.2498f, 2.2505f, 4.0598f)
                curveTo(2.7205f, 3.8698f, 3.2504f, 3.9698f, 3.6104f, 4.3298f)
                lineTo(18.4405f, 19.1598f)
                curveTo(18.5905f, 19.3098f, 18.6705f, 19.5098f, 18.6605f, 19.7198f)
                curveTo(18.6505f, 19.9298f, 18.5605f, 20.1198f, 18.4005f, 20.2598f)
                curveTo(16.5405f, 21.8698f, 14.1705f, 22.7498f, 11.7005f, 22.7498f)
                close()
                moveTo(2.9805f, 5.8098f)
                verticalLineTo(12.2398f)
                curveTo(2.9805f, 17.0798f, 6.7805f, 21.1198f, 11.4505f, 21.2498f)
                curveTo(13.3805f, 21.2898f, 15.2505f, 20.7298f, 16.7805f, 19.6198f)
                lineTo(2.9805f, 5.8098f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2696f, 19.9001f)
                curveTo(20.9496f, 19.9001f, 20.6296f, 19.7701f, 20.3896f, 19.5301f)
                lineTo(5.6896f, 4.8301f)
                curveTo(5.5396f, 4.6801f, 5.4596f, 4.4801f, 5.4696f, 4.2701f)
                curveTo(5.4796f, 4.0601f, 5.5696f, 3.8701f, 5.7296f, 3.7301f)
                curveTo(7.6396f, 2.0601f, 10.1096f, 1.1701f, 12.6696f, 1.2501f)
                curveTo(18.0996f, 1.4001f, 22.5196f, 6.0801f, 22.5196f, 11.6801f)
                verticalLineTo(18.6401f)
                curveTo(22.5196f, 19.1501f, 22.2196f, 19.6001f, 21.7496f, 19.7901f)
                curveTo(21.5996f, 19.8601f, 21.4396f, 19.9001f, 21.2696f, 19.9001f)
                close()
                moveTo(7.3496f, 4.3701f)
                lineTo(21.0296f, 18.0501f)
                verticalLineTo(11.6901f)
                curveTo(21.0296f, 6.9001f, 17.2596f, 2.8901f, 12.6296f, 2.7601f)
                curveTo(10.7196f, 2.7201f, 8.8696f, 3.2701f, 7.3496f, 4.3701f)
                close()
            }
        }
        .build()
        return _ontology!!
    }

private var _ontology: ImageVector? = null
