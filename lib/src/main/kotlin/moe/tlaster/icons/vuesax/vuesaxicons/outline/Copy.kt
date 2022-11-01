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

public val OutlineGroup.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1f, 22.75f)
                horizontalLineTo(6.9f)
                curveTo(2.99f, 22.75f, 1.25f, 21.01f, 1.25f, 17.1f)
                verticalLineTo(12.9f)
                curveTo(1.25f, 8.99f, 2.99f, 7.25f, 6.9f, 7.25f)
                horizontalLineTo(11.1f)
                curveTo(15.01f, 7.25f, 16.75f, 8.99f, 16.75f, 12.9f)
                verticalLineTo(17.1f)
                curveTo(16.75f, 21.01f, 15.01f, 22.75f, 11.1f, 22.75f)
                close()
                moveTo(6.9f, 8.75f)
                curveTo(3.8f, 8.75f, 2.75f, 9.8f, 2.75f, 12.9f)
                verticalLineTo(17.1f)
                curveTo(2.75f, 20.2f, 3.8f, 21.25f, 6.9f, 21.25f)
                horizontalLineTo(11.1f)
                curveTo(14.2f, 21.25f, 15.25f, 20.2f, 15.25f, 17.1f)
                verticalLineTo(12.9f)
                curveTo(15.25f, 9.8f, 14.2f, 8.75f, 11.1f, 8.75f)
                horizontalLineTo(6.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.1f, 16.75f)
                horizontalLineTo(16.0f)
                curveTo(15.59f, 16.75f, 15.25f, 16.41f, 15.25f, 16.0f)
                verticalLineTo(12.9f)
                curveTo(15.25f, 9.8f, 14.2f, 8.75f, 11.1f, 8.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 8.75f, 7.25f, 8.41f, 7.25f, 8.0f)
                verticalLineTo(6.9f)
                curveTo(7.25f, 2.99f, 8.99f, 1.25f, 12.9f, 1.25f)
                horizontalLineTo(17.1f)
                curveTo(21.01f, 1.25f, 22.75f, 2.99f, 22.75f, 6.9f)
                verticalLineTo(11.1f)
                curveTo(22.75f, 15.01f, 21.01f, 16.75f, 17.1f, 16.75f)
                close()
                moveTo(16.75f, 15.25f)
                horizontalLineTo(17.1f)
                curveTo(20.2f, 15.25f, 21.25f, 14.2f, 21.25f, 11.1f)
                verticalLineTo(6.9f)
                curveTo(21.25f, 3.8f, 20.2f, 2.75f, 17.1f, 2.75f)
                horizontalLineTo(12.9f)
                curveTo(9.8f, 2.75f, 8.75f, 3.8f, 8.75f, 6.9f)
                verticalLineTo(7.25f)
                horizontalLineTo(11.1f)
                curveTo(15.01f, 7.25f, 16.75f, 8.99f, 16.75f, 12.9f)
                verticalLineTo(15.25f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
