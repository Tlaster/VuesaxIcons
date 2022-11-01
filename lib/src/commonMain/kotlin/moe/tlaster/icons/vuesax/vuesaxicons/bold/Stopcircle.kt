package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Stopcircle: ImageVector
    get() {
        if (_stopcircle != null) {
            return _stopcircle!!
        }
        _stopcircle = Builder(name = "Stopcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9688f, 2.0f)
                curveTo(6.4488f, 2.0f, 1.9688f, 6.48f, 1.9688f, 12.0f)
                curveTo(1.9688f, 17.52f, 6.4488f, 22.0f, 11.9688f, 22.0f)
                curveTo(17.4887f, 22.0f, 21.9688f, 17.52f, 21.9688f, 12.0f)
                curveTo(21.9688f, 6.48f, 17.4988f, 2.0f, 11.9688f, 2.0f)
                close()
                moveTo(16.2287f, 13.23f)
                curveTo(16.2287f, 14.89f, 14.8887f, 16.23f, 13.2287f, 16.23f)
                horizontalLineTo(10.7688f)
                curveTo(9.1088f, 16.23f, 7.7688f, 14.89f, 7.7688f, 13.23f)
                verticalLineTo(10.77f)
                curveTo(7.7688f, 9.11f, 9.1088f, 7.77f, 10.7688f, 7.77f)
                horizontalLineTo(13.2287f)
                curveTo(14.8887f, 7.77f, 16.2287f, 9.11f, 16.2287f, 10.77f)
                verticalLineTo(13.23f)
                close()
            }
        }
        .build()
        return _stopcircle!!
    }

private var _stopcircle: ImageVector? = null
