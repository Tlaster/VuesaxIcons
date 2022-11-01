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

public val BoldGroup.Rotateright: ImageVector
    get() {
        if (_rotateright != null) {
            return _rotateright!!
        }
        _rotateright = Builder(name = "Rotateright", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 22.0f)
                horizontalLineTo(12.25f)
                curveTo(8.5f, 22.0f, 7.0f, 20.5f, 7.0f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(7.0f, 8.5f, 8.5f, 7.0f, 12.25f, 7.0f)
                horizontalLineTo(16.75f)
                curveTo(20.5f, 7.0f, 22.0f, 8.5f, 22.0f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 20.5f, 20.5f, 22.0f, 16.75f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 10.5f)
                curveTo(3.16f, 10.5f, 3.5f, 10.16f, 3.5f, 9.75f)
                curveTo(3.5f, 6.79f, 5.56f, 4.31f, 8.33f, 3.66f)
                lineTo(8.06f, 4.11f)
                curveTo(7.85f, 4.47f, 7.96f, 4.93f, 8.32f, 5.14f)
                curveTo(8.68f, 5.35f, 9.14f, 5.24f, 9.35f, 4.88f)
                lineTo(10.4f, 3.13f)
                curveTo(10.54f, 2.9f, 10.54f, 2.61f, 10.41f, 2.38f)
                curveTo(10.27f, 2.15f, 10.02f, 2.0f, 9.75f, 2.0f)
                curveTo(5.48f, 2.0f, 2.0f, 5.48f, 2.0f, 9.75f)
                curveTo(2.0f, 10.16f, 2.34f, 10.5f, 2.75f, 10.5f)
                close()
            }
        }
        .build()
        return _rotateright!!
    }

private var _rotateright: ImageVector? = null
