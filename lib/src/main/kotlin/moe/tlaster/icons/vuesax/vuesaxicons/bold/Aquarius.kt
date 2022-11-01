package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Aquarius: ImageVector
    get() {
        if (_aquarius != null) {
            return _aquarius!!
        }
        _aquarius = Builder(name = "Aquarius", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.75f, 9.0f)
                curveTo(19.75f, 4.73f, 16.27f, 1.25f, 12.0f, 1.25f)
                curveTo(7.73f, 1.25f, 4.25f, 4.73f, 4.25f, 9.0f)
                curveTo(4.25f, 9.41f, 4.59f, 9.75f, 5.0f, 9.75f)
                curveTo(5.41f, 9.75f, 5.75f, 9.41f, 5.75f, 9.0f)
                curveTo(5.75f, 5.55f, 8.55f, 2.75f, 12.0f, 2.75f)
                curveTo(15.45f, 2.75f, 18.25f, 5.55f, 18.25f, 9.0f)
                curveTo(18.25f, 12.45f, 15.45f, 15.25f, 12.0f, 15.25f)
                curveTo(11.59f, 15.25f, 11.25f, 15.59f, 11.25f, 16.0f)
                verticalLineTo(22.0f)
                curveTo(11.25f, 22.41f, 11.59f, 22.75f, 12.0f, 22.75f)
                curveTo(12.41f, 22.75f, 12.75f, 22.41f, 12.75f, 22.0f)
                verticalLineTo(16.71f)
                curveTo(16.67f, 16.33f, 19.75f, 13.02f, 19.75f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 19.75f)
                horizontalLineTo(9.0f)
                curveTo(8.59f, 19.75f, 8.25f, 19.41f, 8.25f, 19.0f)
                curveTo(8.25f, 18.59f, 8.59f, 18.25f, 9.0f, 18.25f)
                horizontalLineTo(15.0f)
                curveTo(15.41f, 18.25f, 15.75f, 18.59f, 15.75f, 19.0f)
                curveTo(15.75f, 19.41f, 15.41f, 19.75f, 15.0f, 19.75f)
                close()
            }
        }
        .build()
        return _aquarius!!
    }

private var _aquarius: ImageVector? = null
