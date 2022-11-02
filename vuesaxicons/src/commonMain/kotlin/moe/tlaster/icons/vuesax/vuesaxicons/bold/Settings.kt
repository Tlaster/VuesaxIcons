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

public val BoldGroup.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.5f)
                curveTo(14.4853f, 16.5f, 16.5f, 14.4853f, 16.5f, 12.0f)
                curveTo(16.5f, 9.5147f, 14.4853f, 7.5f, 12.0f, 7.5f)
                curveTo(9.5147f, 7.5f, 7.5f, 9.5147f, 7.5f, 12.0f)
                curveTo(7.5f, 14.4853f, 9.5147f, 16.5f, 12.0f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12.0f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(10.0f)
                curveTo(10.41f, 11.25f, 10.75f, 11.59f, 10.75f, 12.0f)
                curveTo(10.75f, 12.41f, 10.41f, 12.75f, 10.0f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.75f)
                horizontalLineTo(14.0f)
                curveTo(13.59f, 12.75f, 13.25f, 12.41f, 13.25f, 12.0f)
                curveTo(13.25f, 11.59f, 13.59f, 11.25f, 14.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12.0f)
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22.0f, 12.75f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
