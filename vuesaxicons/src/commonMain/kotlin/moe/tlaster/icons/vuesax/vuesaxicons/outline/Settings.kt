package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.25f)
                curveTo(9.11f, 17.25f, 6.75f, 14.9f, 6.75f, 12.0f)
                curveTo(6.75f, 9.1f, 9.11f, 6.75f, 12.0f, 6.75f)
                curveTo(14.89f, 6.75f, 17.25f, 9.1f, 17.25f, 12.0f)
                curveTo(17.25f, 14.9f, 14.89f, 17.25f, 12.0f, 17.25f)
                close()
                moveTo(12.0f, 8.25f)
                curveTo(9.93f, 8.25f, 8.25f, 9.93f, 8.25f, 12.0f)
                curveTo(8.25f, 14.07f, 9.93f, 15.75f, 12.0f, 15.75f)
                curveTo(14.07f, 15.75f, 15.75f, 14.07f, 15.75f, 12.0f)
                curveTo(15.75f, 9.93f, 14.07f, 8.25f, 12.0f, 8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12.0f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(7.0f)
                curveTo(7.41f, 11.25f, 7.75f, 11.59f, 7.75f, 12.0f)
                curveTo(7.75f, 12.41f, 7.41f, 12.75f, 7.0f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.75f)
                horizontalLineTo(17.0f)
                curveTo(16.59f, 12.75f, 16.25f, 12.41f, 16.25f, 12.0f)
                curveTo(16.25f, 11.59f, 16.59f, 11.25f, 17.0f, 11.25f)
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
