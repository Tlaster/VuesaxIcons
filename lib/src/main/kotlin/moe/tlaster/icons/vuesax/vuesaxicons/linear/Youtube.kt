package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 20.0f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 20.0f, 2.0f, 18.0f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 6.0f, 4.0f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 4.0f, 22.0f, 6.0f, 22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 18.0f, 20.0f, 20.0f, 17.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.4001f, 9.5001f)
                lineTo(13.9001f, 11.0001f)
                curveTo(14.8001f, 11.6001f, 14.8001f, 12.5001f, 13.9001f, 13.1001f)
                lineTo(11.4001f, 14.6001f)
                curveTo(10.4001f, 15.2001f, 9.6001f, 14.7001f, 9.6001f, 13.6001f)
                verticalLineTo(10.6001f)
                curveTo(9.6001f, 9.3001f, 10.4001f, 8.9001f, 11.4001f, 9.5001f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
