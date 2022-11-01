package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Be: ImageVector
    get() {
        if (_be != null) {
            return _be!!
        }
        _be = Builder(name = "Be", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                horizontalLineTo(9.0f)
                curveTo(10.7f, 12.0f, 12.0f, 13.3f, 12.0f, 15.0f)
                curveTo(12.0f, 16.7f, 10.7f, 18.0f, 9.0f, 18.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4f, 18.0f, 2.0f, 17.6f, 2.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 6.4f, 2.4f, 6.0f, 3.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(9.7f, 6.0f, 11.0f, 7.3f, 11.0f, 9.0f)
                curveTo(11.0f, 10.7f, 9.7f, 12.0f, 8.0f, 12.0f)
                horizontalLineTo(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 11.8f, 20.2f, 10.0f, 18.0f, 10.0f)
                curveTo(15.8f, 10.0f, 14.0f, 11.8f, 14.0f, 14.0f)
                close()
                moveTo(14.0f, 14.0f)
                curveTo(14.0f, 16.2f, 15.8f, 18.0f, 18.0f, 18.0f)
                horizontalLineTo(19.7f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 7.5f)
                horizontalLineTo(16.5f)
            }
        }
        .build()
        return _be!!
    }

private var _be: ImageVector? = null
