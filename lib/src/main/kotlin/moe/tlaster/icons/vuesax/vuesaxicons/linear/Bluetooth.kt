package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.6401f, 18.64f)
                lineTo(17.9901f, 7.32f)
                curveTo(18.5001f, 6.85f, 18.4901f, 6.1f, 17.9501f, 5.65f)
                lineTo(14.1001f, 2.44f)
                curveTo(13.1001f, 1.61f, 12.2801f, 1.99f, 12.2801f, 3.29f)
                verticalLineTo(20.71f)
                curveTo(12.2801f, 22.01f, 13.1001f, 22.39f, 14.1001f, 21.56f)
                lineTo(17.9501f, 18.35f)
                curveTo(18.4901f, 17.9f, 18.5001f, 17.15f, 17.9901f, 16.68f)
                lineTo(5.6401f, 5.36f)
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
