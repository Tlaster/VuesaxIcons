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

public val LinearGroup.Dashdash: ImageVector
    get() {
        if (_dashdash != null) {
            return _dashdash!!
        }
        _dashdash = Builder(name = "Dashdash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0999f, 3.5f)
                horizontalLineTo(15.9999f)
                curveTo(19.9999f, 3.5f, 21.9999f, 6.0f, 21.9999f, 9.5f)
                verticalLineTo(12.0f)
                curveTo(21.9999f, 17.0f, 18.9999f, 20.5f, 13.4999f, 20.5f)
                horizontalLineTo(3.8999f)
                lineTo(4.9999f, 16.2f)
                horizontalLineTo(12.3999f)
                curveTo(15.9999f, 16.2f, 17.6999f, 14.0f, 17.6999f, 10.9f)
                verticalLineTo(10.7f)
                curveTo(17.6999f, 8.9f, 16.8999f, 7.7f, 14.6999f, 7.7f)
                horizontalLineTo(6.0999f)
                lineTo(7.0999f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 10.5f)
                horizontalLineTo(4.3f)
                curveTo(3.4f, 10.5f, 2.6f, 11.1f, 2.4f, 12.0f)
                lineTo(2.0f, 13.5f)
                horizontalLineTo(9.2f)
                curveTo(10.1f, 13.5f, 10.9f, 12.9f, 11.1f, 12.0f)
                lineTo(11.5f, 10.5f)
                close()
            }
        }
        .build()
        return _dashdash!!
    }

private var _dashdash: ImageVector? = null
