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

public val LinearGroup.Unlock: ImageVector
    get() {
        if (_unlock != null) {
            return _unlock!!
        }
        _unlock = Builder(name = "Unlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(3.0f, 22.0f, 2.0f, 21.0f, 2.0f, 17.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 11.0f, 3.0f, 10.0f, 7.0f, 10.0f)
                horizontalLineTo(17.0f)
                curveTo(21.0f, 10.0f, 22.0f, 11.0f, 22.0f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 21.0f, 21.0f, 22.0f, 17.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(6.0f, 4.69f, 7.0f, 2.0f, 12.0f, 2.0f)
                curveTo(16.5f, 2.0f, 18.0f, 4.0f, 18.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.5f)
                curveTo(13.3807f, 18.5f, 14.5f, 17.3807f, 14.5f, 16.0f)
                curveTo(14.5f, 14.6193f, 13.3807f, 13.5f, 12.0f, 13.5f)
                curveTo(10.6193f, 13.5f, 9.5f, 14.6193f, 9.5f, 16.0f)
                curveTo(9.5f, 17.3807f, 10.6193f, 18.5f, 12.0f, 18.5f)
                close()
            }
        }
        .build()
        return _unlock!!
    }

private var _unlock: ImageVector? = null
