package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Messageminus: ImageVector
    get() {
        if (_messageminus != null) {
            return _messageminus!!
        }
        _messageminus = Builder(name = "Messageminus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 8.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 21.55f, 2.45f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 16.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 11.25f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 11.25f, 7.75f, 11.59f, 7.75f, 12.0f)
                curveTo(7.75f, 12.41f, 8.09f, 12.75f, 8.5f, 12.75f)
                horizontalLineTo(15.5f)
                curveTo(15.91f, 12.75f, 16.25f, 12.41f, 16.25f, 12.0f)
                curveTo(16.25f, 11.59f, 15.91f, 11.25f, 15.5f, 11.25f)
                close()
            }
        }
        .build()
        return _messageminus!!
    }

private var _messageminus: ImageVector? = null
