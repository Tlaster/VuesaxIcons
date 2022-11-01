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

public val BoldGroup.Electricity: ImageVector
    get() {
        if (_electricity != null) {
            return _electricity!!
        }
        _electricity = Builder(name = "Electricity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.59f, 5.0f)
                horizontalLineTo(15.25f)
                verticalLineTo(2.0f)
                curveTo(15.25f, 1.59f, 14.91f, 1.25f, 14.5f, 1.25f)
                curveTo(14.09f, 1.25f, 13.75f, 1.59f, 13.75f, 2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.25f)
                verticalLineTo(2.0f)
                curveTo(10.25f, 1.59f, 9.91f, 1.25f, 9.5f, 1.25f)
                curveTo(9.09f, 1.25f, 8.75f, 1.59f, 8.75f, 2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.41f)
                curveTo(7.36f, 5.0f, 6.5f, 5.86f, 6.5f, 6.91f)
                verticalLineTo(12.0f)
                curveTo(6.5f, 14.2f, 8.0f, 16.0f, 10.5f, 16.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(22.0f)
                curveTo(11.25f, 22.41f, 11.59f, 22.75f, 12.0f, 22.75f)
                curveTo(12.41f, 22.75f, 12.75f, 22.41f, 12.75f, 22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.5f)
                curveTo(16.0f, 16.0f, 17.5f, 14.2f, 17.5f, 12.0f)
                verticalLineTo(6.91f)
                curveTo(17.5f, 5.86f, 16.64f, 5.0f, 15.59f, 5.0f)
                close()
            }
        }
        .build()
        return _electricity!!
    }

private var _electricity: ImageVector? = null
