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

public val OutlineGroup.Toggleoff: ImageVector
    get() {
        if (_toggleoff != null) {
            return _toggleoff!!
        }
        _toggleoff = Builder(name = "Toggleoff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7f, 16.75f)
                horizontalLineTo(8.3f)
                curveTo(5.88f, 16.75f, 4.75f, 15.62f, 4.75f, 13.2f)
                verticalLineTo(10.8f)
                curveTo(4.75f, 8.38f, 5.88f, 7.25f, 8.3f, 7.25f)
                horizontalLineTo(10.7f)
                curveTo(13.12f, 7.25f, 14.25f, 8.38f, 14.25f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(14.25f, 15.62f, 13.12f, 16.75f, 10.7f, 16.75f)
                close()
                moveTo(8.3f, 8.75f)
                curveTo(6.71f, 8.75f, 6.25f, 9.21f, 6.25f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(6.25f, 14.79f, 6.71f, 15.25f, 8.3f, 15.25f)
                horizontalLineTo(10.7f)
                curveTo(12.29f, 15.25f, 12.75f, 14.79f, 12.75f, 13.2f)
                verticalLineTo(10.8f)
                curveTo(12.75f, 9.21f, 12.29f, 8.75f, 10.7f, 8.75f)
                horizontalLineTo(8.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.75f)
                horizontalLineTo(7.0f)
                curveTo(2.59f, 20.75f, 1.25f, 19.41f, 1.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.25f, 4.59f, 2.59f, 3.25f, 7.0f, 3.25f)
                horizontalLineTo(17.0f)
                curveTo(21.41f, 3.25f, 22.75f, 4.59f, 22.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.75f, 19.41f, 21.41f, 20.75f, 17.0f, 20.75f)
                close()
                moveTo(7.0f, 4.75f)
                curveTo(3.42f, 4.75f, 2.75f, 5.43f, 2.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.75f, 18.57f, 3.42f, 19.25f, 7.0f, 19.25f)
                horizontalLineTo(17.0f)
                curveTo(20.58f, 19.25f, 21.25f, 18.57f, 21.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.25f, 5.43f, 20.58f, 4.75f, 17.0f, 4.75f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _toggleoff!!
    }

private var _toggleoff: ImageVector? = null
