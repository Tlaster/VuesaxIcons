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

public val LinearGroup.Bagtimer: ImageVector
    get() {
        if (_bagtimer != null) {
            return _bagtimer!!
        }
        _bagtimer = Builder(name = "Bagtimer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(14.2091f, 19.0f, 16.0f, 17.2091f, 16.0f, 15.0f)
                curveTo(16.0f, 12.7909f, 14.2091f, 11.0f, 12.0f, 11.0f)
                curveTo(9.7909f, 11.0f, 8.0f, 12.7909f, 8.0f, 15.0f)
                curveTo(8.0f, 17.2091f, 9.7909f, 19.0f, 12.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.25f, 13.75f)
                verticalLineTo(14.68f)
                curveTo(12.25f, 15.03f, 12.07f, 15.36f, 11.76f, 15.54f)
                lineTo(11.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(19.02f, 22.0f, 19.74f, 20.39f, 19.95f, 18.43f)
                lineTo(20.7f, 12.43f)
                curveTo(20.97f, 9.99f, 20.27f, 8.0f, 16.0f, 8.0f)
                horizontalLineTo(8.0f)
                curveTo(3.73f, 8.0f, 3.03f, 9.99f, 3.3f, 12.43f)
                lineTo(4.05f, 18.43f)
                curveTo(4.26f, 20.39f, 4.98f, 22.0f, 9.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 7.67f)
                verticalLineTo(6.7f)
                curveTo(7.5f, 4.45f, 9.31f, 2.24f, 11.56f, 2.03f)
                curveTo(14.24f, 1.77f, 16.5f, 3.88f, 16.5f, 6.51f)
                verticalLineTo(7.89f)
            }
        }
        .build()
        return _bagtimer!!
    }

private var _bagtimer: ImageVector? = null
