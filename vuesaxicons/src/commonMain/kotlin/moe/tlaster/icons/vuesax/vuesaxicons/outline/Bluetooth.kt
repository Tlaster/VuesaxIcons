package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.1299f, 22.7501f)
                curveTo(12.8599f, 22.7501f, 12.6498f, 22.6801f, 12.4998f, 22.6101f)
                curveTo(12.1398f, 22.4401f, 11.5298f, 21.9701f, 11.5298f, 20.7101f)
                verticalLineTo(14.2601f)
                lineTo(6.1399f, 19.2001f)
                curveTo(5.8399f, 19.4801f, 5.3598f, 19.4601f, 5.0798f, 19.1501f)
                curveTo(4.7998f, 18.8401f, 4.8198f, 18.3701f, 5.1298f, 18.0901f)
                lineTo(11.5298f, 12.2201f)
                verticalLineTo(11.7701f)
                lineTo(5.1298f, 5.9001f)
                curveTo(4.8198f, 5.6201f, 4.7998f, 5.1501f, 5.0798f, 4.8401f)
                curveTo(5.3598f, 4.5401f, 5.8399f, 4.5101f, 6.1399f, 4.7901f)
                lineTo(11.5298f, 9.7301f)
                verticalLineTo(3.2801f)
                curveTo(11.5298f, 2.0201f, 12.1398f, 1.5401f, 12.4998f, 1.3801f)
                curveTo(12.8598f, 1.2101f, 13.6098f, 1.0501f, 14.5798f, 1.8601f)
                lineTo(18.4298f, 5.0701f)
                curveTo(18.8498f, 5.4201f, 19.0998f, 5.9201f, 19.1098f, 6.4501f)
                curveTo(19.1198f, 6.9801f, 18.8998f, 7.4901f, 18.4898f, 7.8601f)
                lineTo(13.9898f, 11.9901f)
                lineTo(18.4898f, 16.1201f)
                curveTo(18.8898f, 16.4901f, 19.1198f, 17.0101f, 19.1098f, 17.5301f)
                curveTo(19.0998f, 18.0601f, 18.8498f, 18.5601f, 18.4298f, 18.9101f)
                lineTo(14.5798f, 22.1201f)
                curveTo(14.0098f, 22.6101f, 13.5099f, 22.7501f, 13.1299f, 22.7501f)
                close()
                moveTo(13.0298f, 13.1501f)
                verticalLineTo(20.7101f)
                curveTo(13.0298f, 21.0801f, 13.1098f, 21.2401f, 13.1498f, 21.2601f)
                curveTo(13.1598f, 21.2501f, 13.3398f, 21.2101f, 13.6198f, 20.9801f)
                lineTo(17.4698f, 17.7701f)
                curveTo(17.5598f, 17.6901f, 17.6098f, 17.6001f, 17.6098f, 17.5001f)
                curveTo(17.6098f, 17.4001f, 17.5699f, 17.3101f, 17.4799f, 17.2301f)
                lineTo(13.0298f, 13.1501f)
                close()
                moveTo(13.1198f, 2.7501f)
                curveTo(13.1098f, 2.7601f, 13.0298f, 2.9301f, 13.0298f, 3.2901f)
                verticalLineTo(10.8501f)
                lineTo(17.4799f, 6.7701f)
                curveTo(17.5699f, 6.6901f, 17.6098f, 6.6001f, 17.6098f, 6.5001f)
                curveTo(17.6098f, 6.4001f, 17.5598f, 6.3101f, 17.4698f, 6.2301f)
                lineTo(13.6098f, 3.0201f)
                curveTo(13.3498f, 2.8001f, 13.1798f, 2.7501f, 13.1198f, 2.7501f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
