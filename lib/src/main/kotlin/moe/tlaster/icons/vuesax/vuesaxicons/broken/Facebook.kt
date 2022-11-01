package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(name = "Facebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 9.3f)
                verticalLineTo(12.25f)
                horizontalLineTo(16.63f)
                curveTo(16.82f, 12.25f, 16.96f, 12.42f, 16.92f, 12.61f)
                lineTo(16.54f, 14.51f)
                curveTo(16.51f, 14.65f, 16.39f, 14.75f, 16.25f, 14.75f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.75f)
                horizontalLineTo(9.3f)
                curveTo(9.13f, 14.75f, 9.0f, 14.62f, 9.0f, 14.45f)
                verticalLineTo(12.55f)
                curveTo(9.0f, 12.38f, 9.13f, 12.25f, 9.3f, 12.25f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                curveTo(11.0f, 7.34f, 12.34f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(16.7f)
                curveTo(16.87f, 6.0f, 17.0f, 6.13f, 17.0f, 6.3f)
                verticalLineTo(8.7f)
                curveTo(17.0f, 8.87f, 16.87f, 9.0f, 16.7f, 9.0f)
                horizontalLineTo(14.3f)
                curveTo(14.13f, 9.0f, 14.0f, 9.13f, 14.0f, 9.3f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.83f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
